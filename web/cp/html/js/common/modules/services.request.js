
angular.module('services.request', []);
angular.module('services.request').factory('Request', ['$http', '$timeout', '$q', function($http, $timeout, $q) {
        var url = '/api';
        return {
            get: function(params, success, error) {
                $http.get(url, {params: params}).success(function(res) {
                    success(res);
                }).error(error);
            },
            post: function(data, success, error) {
                data = $.param(data);
                $http.post(url, data).success(function(res) {
                    success(res);
                }).error(error);
            }
        };

    }]);
