angular.module('services.auth', []);
angular.module('services.auth').factory('Auth', function($http, $cookieStore){
    
    var usersession = $cookieStore.get("usersession");
    
    return {
        isLoggedIn: function() {
            if( (usersession !== undefined) ) {
                var now = new Date();
                var expire = new Date(usersession.expire);
                
                if( ent.utils.dateDiffMinute(now, expire) > 0 ) {
                    console.log('expired.');
                    return false;
                } else {
                    console.log('logged in.');
                    return true;
                }
            } else {
                console.log('There is no session.');
                return false;
            }
        },
        login: function(userInfo, success, error) {
            // remove old values
            $cookieStore.remove("JSESSIONID");
            $cookieStore.remove("sessionKey");
            
            $cookieStore.remove("usersession");
            var data = {'command':'login', 'username': userInfo.username, 'password':userInfo.password, 'domain':'/', 'response':'json'};
            $http.post(apiUrl, data ).success(function(res){

                if(res.errorresponse !== undefined) { // login error
                    error(res);
                } else if(res.loginresponse !== undefined) { // login success
                    
                    var sessionkey = res.loginresponse.sessionkey;
                    var timeout = res.loginresponse.timeout;

                    var expire = new Date();
                    expire = ent.utils.dateAddMinute(expire, timeout/60);

                    usersession = { "sessionkey" : sessionkey, "expire" : expire };
                    
                    $cookieStore.put("usersession", usersession);
                    
                    // Put sessionKey
                    $cookieStore.put("sessionKey", sessionkey);
                    
                    
                    success(res);
                }
            }).error(error);
        },
        logout: function(success, error) {
            $cookieStore.remove("usersession");
            var data = {'command':'logout', 'response':'json'};
            $http.post(apiUrl, data).success(function(res){
                success(res);
            }).error(error);
        },
        usersession: usersession
    };
});
