
angular.module('appliances', [  'services.breadcrumbs', 'services.pluginsProvider']).
config(['pluginsProvider', function(pluginsProvider){
    pluginsProvider.register('Appliances', '/appliances', 'fa fa-cloud', {
        controller: 'AppliancesCtrl',
        templateUrl: '/js/plugins/appliances/appliances.tpl.html'
    });
}]);

angular.module('appliances').controller('AppliancesCtrl', ['$scope', 'Breadcrumbs', function($scope, Breadcrumbs){
    Breadcrumbs.refresh();
    Breadcrumbs.push('Appliances', '/#/appliances');
}]);
