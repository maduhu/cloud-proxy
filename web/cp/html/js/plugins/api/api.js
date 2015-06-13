
angular.module('api', [  'services.breadcrumbs', 'services.pluginsProvider']).
config(['pluginsProvider', function(pluginsProvider){
    pluginsProvider.register('API', '/api', 'fa fa-link', {
        controller: 'ApiCtrl',
        templateUrl: '/js/plugins/api/api.tpl.html'
    });
}]);

angular.module('api').controller('ApiCtrl', ['$scope', 'Breadcrumbs', function($scope, Breadcrumbs){
    Breadcrumbs.refresh();
    Breadcrumbs.push('API', '/#/api');
}]);
