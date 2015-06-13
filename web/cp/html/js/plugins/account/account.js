
angular.module('account', [  'services.breadcrumbs', 'services.pluginsProvider']).
config(['pluginsProvider', function(pluginsProvider){
    pluginsProvider.register('Account', '/account', 'icon-cloud', {
        controller: 'AccountCtrl',
        templateUrl: '/js/plugins/account/account.tpl.html'
    }).
    extend('/account/billing', {
        controller: 'BillingCtrl',
        templateUrl: '/js/plugins/account/account-billing.tpl.html'
    });
}]);

angular.module('account').controller('AccountCtrl', ['$scope', 'Breadcrumbs', function($scope, Breadcrumbs){
    Breadcrumbs.refresh();
    Breadcrumbs.push('Account', '/#/account');
}]);

angular.module('account').controller('BillingCtrl', ['$scope', 'Breadcrumbs', function($scope, Breadcrumbs){
    Breadcrumbs.refresh();
    Breadcrumbs.push('Account', '/#/account');
    Breadcrumbs.push('Billing', '/#/account/billing');
}]);