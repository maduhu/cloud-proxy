
angular.module('domains', [  'services.breadcrumbs', 'services.pluginsProvider']).
config(['pluginsProvider', function(pluginsProvider){
    pluginsProvider.register('Domains', '/domains', 'fa fa-globe', {
        controller: 'DomainsCtrl',
        templateUrl: '/js/plugins/domains/domains.tpl.html'
    });
}]);

angular.module('domains').controller('DomainsCtrl', ['$scope', 'Breadcrumbs', function($scope, Breadcrumbs){
    Breadcrumbs.refresh();
    Breadcrumbs.push('Domains', '/#/domains');
}]);
