
angular.module('Site', [
    'ngRoute',
    'ngResource',
    'ngAnimate',
    'dashboard',
    'instances',
    'storage',
    'appliances',
    'account',
    'domains',
    'api',
    'services.breadcrumbs',
    'services.pluginsProvider',
    'services.auth',
    'services.request',
    'angular-md5',
    'ngCookies',
    'chartjs',
    'chartjs-directive',
    'chieffancypants.loadingBar'
]).
        config(['$routeProvider', '$httpProvider', '$locationProvider', 'cfpLoadingBarProvider', function($routeProvider, $httpProvider, $locationProvider, cfpLoadingBarProvider) {

                cfpLoadingBarProvider.includeSpinner = true;
                cfpLoadingBarProvider.includeBar = false;

                $httpProvider.defaults.useXDomain = true;
                delete $httpProvider.defaults.headers.common['X-Requested-With'];

                $routeProvider.
                        when('/', {
                            controller: 'DefaultCtrl',
                            template: '<div></div>'
                        }).
                        otherwise({
                            redirectTo: '/'
                        });

                $httpProvider.interceptors.push(['$q', '$rootScope', function($q, $rootScope) {
                        $rootScope.pendingRequests = 0;
                        return {
                            /* All the following methods are optional */
                            
                            request: function(config) {
                                /*
                                 Called before send a new XHR request.
                                 This is a good place where manipulate the
                                 request parameters.
                                 */
                                console.log('status: request');
                                $("#spinner").show();
                                $rootScope.pendingRequests++;

                                return config || $q.when(config);
                            },
                            requestError: function(rejection) {
                                // Called when another request fails.

                                // I am still searching a good use case for this.
                                // If you are aware of it, please write a comment
                                $("#spinner").hide();
                                $rootScope.pendingRequests--;

                                return $q.reject(rejection);
                            },
                            response: function(response) {
                                // Called before a promise is resolved.
                                console.log('status: response');
                                $("#spinner").hide();
                                $rootScope.pendingRequests--;
                                
                                return response || $q.when(response);
                            },
                            responseError: function(rejection) {
                                /*
                                 Called when another XHR request returns with
                                 an error status code.
                                 */
                                $("#spinner").hide();
                                $rootScope.pendingRequests--;
                                
                                if (response.status === 401) {
                                    console.log('status: 401');
                                }
                                else {
                                    console.log('status: xxx');
                                }

                                return $q.reject(rejection);
                            }

                        };

                    }]);

            }]);


angular.module('Site').controller('DefaultCtrl', ['$scope', 'Breadcrumbs', '$location', function($scope, Breadcrumbs, $location) {
        Breadcrumbs.refresh();
//        if (Auth.isLoggedIn())
//            $location.path('/dashboard');
        if(true) $location.path('/dashboard');
        console.log("WTF!");
    }]);


angular.module('Site').controller('HeaderCtrl', ['$scope', function($scope) {

    }]);

angular.module('Site').controller('NavCtrl', ['$scope', '$location', function($scope, $location) {
        $scope.isActive = function(page) {
            return $location.path().split('/')[1] === page.split('/')[1] ? 'active' : '';
        };
    }]);

angular.module('Site').controller('SiteCtrl', ['$scope', 'Breadcrumbs', 'Auth', 'Dictionary', '$rootScope', 'plugins', '$resource', 'cfpLoadingBar', '$timeout', function($scope, Breadcrumbs, Auth, Dictionary, $rootScope, plugins, $resource, cfpLoadingBar, $timeout) {
        $scope.plugins = plugins;
        $scope.breadcrumbs = Breadcrumbs;
        $scope.dictionary = Dictionary;
        $scope.shortcuts = [
            {url: "#", name: "Deploy New Instance"},
            {url: "#", name: "Pay Bill"}
        ];

        $scope.virtualmachines = [
            {id: "1", displayname: "Instance1"},
            {id: "2", displayname: "Instance2"},
            {id: "3", displayname: "Instance3"}
        ];

        $scope.domain = '/';

        $scope.isLogin = false;
        /*
         * 
         * function login()
         */
        $scope.login = function() {
            Auth.login({
                username: $scope.username,
                password: $scope.password,
                rememberme: $scope.rememberme
            },
            function(res) {
                console.info("Login Success: " + res);
                console.info('login success: ' + res.loginresponse.username + ',' + res.loginresponse.timeout);
                $scope.isLogin = true;
            },
                    function(err) {
                        $rootScope.error = "Failed to login";
                        console.info("Login Error: " + err);
                        $scope.isLogin = false;
                    });
        };
        /*
         * 
         * function logout()
         */
        $scope.logout = function() {
            Auth.logout(
                    function(res) {
                        console.info("Logout Success");
                        console.info("Logout Success: " + res.description);
                        $scope.isLogin = false;
                    },
                    function(err) {
                        $rootScope.error = "Failed to logout";
                        console.info("Logout Error: " + err);
                        $scope.isLogin = false;
                    });
        };

        /*
         * route changing listener
         */
        $rootScope.$on("$routeChangeStart", function(event, next, current) {
            $rootScope.error = null;
            
            console.info('isLoggedIn = ' + $scope.isLogin);

            /*if (Auth.isLoggedIn()) {
             $scope.isLogin = true;
             }
             else {
             //$scope.isLogin = false;
             $scope.isLogin = true;
             }*/
            console.info('isLoggedIn = ' + $scope.isLogin);
        });
        

        /*
         * function bypass(), to bypass login page for test
         */
        $scope.bypass = function() {
            if ($scope.isLogin === false ) {
                if($scope.username === 'g' && $scope.password === 'g' || true) {
                    $scope.isLogin = true;
                }
            } else {
                $scope.isLogin = false;
            }
        };

        // Test Spinner
        $scope.items = [{
                name: "One"
            }];
        $scope.posts = [];
        $scope.section = null;
        $scope.subreddit = null;
        $scope.subreddits = ['cats', 'pics', 'funny', 'gaming', 'AdviceAnimals', 'aww'];

        var getRandomSubreddit = function() {
            var sub = $scope.subreddits[Math.floor(Math.random() * $scope.subreddits.length)];

            // ensure we get a new subreddit each time.
            if (sub == $scope.subreddit) {
                return getRandomSubreddit();
            }

            return sub;
        };

        $scope.fetch = function() {
            $scope.subreddit = getRandomSubreddit();
            $http.jsonp('http://www.reddit.com/r/' + $scope.subreddit + '.json?limit=50&jsonp=JSON_CALLBACK').success(function(data) {
                $scope.posts = data.data.children;
            });
        };

        $scope.start = function() {
            cfpLoadingBar.start();
        };

        $scope.complete = function() {
            cfpLoadingBar.complete();
        }


        // fake the initial load so first time users can see it right away:
        $scope.start();
        $scope.fakeIntro = true;
        $timeout(function() {
            $scope.$apply(function() {
                $scope.items[0].lateLoader = 'i just loaded';
            });
            $scope.complete();
            $scope.fakeIntro = false;
        }, 2000);


    }]);

angular.module('Site').run(['$location', function($location) {

    }]);
