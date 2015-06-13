
angular.module('storage', [ 'services.breadcrumbs', 'services.pluginsProvider']).
config(['pluginsProvider', function(pluginsProvider){
    pluginsProvider.register('Storage', '/storage', 'fa fa-hdd-o', {
        controller: 'StorageListCtrl',
        templateUrl: '/js/plugins/storage/storage.tpl.html'
    });
}]);

angular.module('storage').controller('StorageListCtrl', ['$scope', 'Breadcrumbs', function($scope, Breadcrumbs){

    Breadcrumbs.refresh();
    Breadcrumbs.push('Storage', '/#/storage');
    
    $scope.toggleDataDisk = true;
    $scope.toggleSnapshots = true;
}]);
