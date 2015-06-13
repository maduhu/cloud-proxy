
angular.module('services.pluginsProvider', []);
angular.module('services.pluginsProvider').provider('plugins', ['$routeProvider', function($routeProvider){
    var plugins = [];
    var defaultOrder = [
        '/dashboard',
        '/instances',
        '/storage',
        '/appliances',
        '/domains',
        '/api'
    ];

    this.$get = function(){
        plugins = $.grep(plugins, function(n){ return(n); });
        return {
            listAll: function(){
                return plugins;
            }
        };
    };

    this.register = function(name, url, iconclass, params){
        
        if($.inArray(defaultOrder, url)){
            plugins[defaultOrder.indexOf(url)] = {url: url, name: name, iconclass: iconclass};
        }
        else{
            plugins.push({url: url, name: name, iconclass: iconclass});
        }

        if(!!params){
            $routeProvider.when(url, params);
        }
        return {
            extend : function(url, params){
                $routeProvider.when(url, params);
                return this;
            }
        };
    };
}]);
