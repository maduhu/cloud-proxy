
angular.module('instances', [ 'services.breadcrumbs', 'services.pluginsProvider']).
config(['pluginsProvider', function(pluginsProvider){

    pluginsProvider.register('Instances', '/instances', 'fa fa-desktop' , {
        controller: 'VirtualMachinesListCtrl',
        templateUrl: '/js/plugins/instances/instances.tpl.html',
        resolve:{
            virtualmachines : function(){
                var ret = [ 
                    {id : "1", displayname : "Instance1" },
                    {id : "2", displayname : "Instance2" },
                    {id : "3", displayname : "Instance3" }
                ];
                return ret;
            }
        }
    }).
    extend('/instances/:id', {
        controller: 'VirtualMachineDetailCtrl',
        templateUrl: '/js/plugins/instances/instance-details.tpl.html',
        resolve: {
            virtualmachine: function(){
                var ret =  {id : "1", displayname : "Instance1" };
                return ret;
            }
        }
    });
}]);

angular.module('instances').controller('VirtualMachinesListCtrl', ['$scope', 'Breadcrumbs', function($scope, Breadcrumbs){
    Breadcrumbs.refresh();
    Breadcrumbs.push('Instances', '/#/instances');
    
    $scope.toggle = true;

}]);

angular.module('instances').controller('VirtualMachineDetailCtrl', ['$scope', 'Breadcrumbs', /*'virtualmachine',*/ function($scope, Breadcrumbs /*, virtualmachine*/){
    Breadcrumbs.refresh();
    Breadcrumbs.push('Instances', '/#/instances');
    //Breadcrumbs.push(virtualmachine.displayname, '/#/instances/'+ virtualmachine.id);
    //$scope.virtualmachine = virtualmachine;
    
    $scope.details = [{name: 'Display Name', value:'VM01'},{name:'State', value:'Stopped'},{name:'Compute Offering', value:'Medium Instance'}];
    $scope.nics = [{name: 'IP Address', value:'192.168.0.110'},{name:'Gateway', value:'192.168.0.1'},{name:'Netmask', value:'255.255.255.0'}];
    $scope.statistics = [{name: 'CPU Speed', value:'1 x 1000 MHz'},{name:'CPU Utilized', value:'10%'},{name:'Network Read', value:'230 KB'},{name:'Network Write', value:'10034 KB'}];
    
}]);
