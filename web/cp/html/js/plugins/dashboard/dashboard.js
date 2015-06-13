
angular.module('dashboard', ['services.pluginsProvider']).
        config(['pluginsProvider', function(pluginsProvider) {

                pluginsProvider.register('Dashboard', '/dashboard', 'fa fa-dashboard', {
                    controller: 'DashboardCtrl',
                    templateUrl: '/js/plugins/dashboard/dashboard.tpl.html'
                });
            }]);

angular.module('dashboard').controller('DashboardCtrl', ['$scope', 'Breadcrumbs', function($scope, Breadcrumbs) {
        Breadcrumbs.refresh();

        var percentages = [80, 20, 75, 61];

        $scope.data1 = [
            {value: percentages[0], color: '#f377ab'},
            {value: 100 - percentages[0], color: '#e5e5e5'}
        ];
        $scope.data2 = [
            {value: percentages[1], color: '#3da0ea'},
            {value: 100 - percentages[1], color: '#e5e5e5'}
        ];
        $scope.data3 = [
            {value: percentages[2], color: '#e7912a'},
            {value: 100 - percentages[2], color: '#e5e5e5'}
        ];
        $scope.data4 = [
            {value: percentages[3], color: '#bacf0b'},
            {value: 100 - percentages[3], color: '#e5e5e5'}
        ];

        $scope.option1 = {
            segementStrokeWidth: 0,
            segmentStrokeColor: '#000',
            segmentShowStroke: false,
            percentageInnerCutout: 70,
            animation: true,
            animationSteps: 100,
            animationEasing: "easeOutBounce",
            animateRotate: true,
            animateScale: false,
            onAnimationComplete: null,
            labelFontSize: 15,
            labelText: percentages[0]
        };
        $scope.option2 = {
            segementStrokeWidth: 0,
            segmentStrokeColor: '#000',
            segmentShowStroke: false,
            percentageInnerCutout: 70,
            animation: true,
            animationSteps: 100,
            animationEasing: "easeOutBounce",
            animateRotate: true,
            animateScale: false,
            onAnimationComplete: null,
            labelFontSize: 15,
            labelText: percentages[1]
        };
        $scope.option3 = {
            segementStrokeWidth: 0,
            segmentStrokeColor: '#000',
            segmentShowStroke: false,
            percentageInnerCutout: 70,
            animation: true,
            animationSteps: 100,
            animationEasing: "easeOutBounce",
            animateRotate: true,
            animateScale: false,
            onAnimationComplete: null,
            labelFontSize: 15,
            labelText: percentages[2]
        };
        $scope.option4 = {
            segementStrokeWidth: 0,
            segmentStrokeColor: '#000',
            segmentShowStroke: false,
            percentageInnerCutout: 70,
            animation: true,
            animationSteps: 100,
            animationEasing: "easeOutBounce",
            animateRotate: true,
            animateScale: false,
            onAnimationComplete: null,
            labelFontSize: 15,
            labelText: percentages[3]
        };

        var data = {
            labels: ["January", "February", "March", "April", "May", "June", "July"],
            datasets: [
                {
                    fillColor: "rgba(220,220,220,0.5)",
                    strokeColor: "rgba(220,220,220,1)",
                    pointColor: "rgba(220,220,220,1)",
                    pointStrokeColor: "#fff",
                    data: [ 10, 50, 80, 70, 75, 70, 46 ]
                },
                {
                    fillColor: "rgba(151,187,205,0.5)",
                    strokeColor: "rgba(151,187,205,1)",
                    pointColor: "rgba(151,187,205,1)",
                    pointStrokeColor: "#fff",
                    data: [ 70, 50, 34, 55, 27, 13, 2 ]
                }
            ]
        };
        $scope.lineChart = {"data": data, "options": {}};
        $scope.barChart = {"data": data, "options": {}};
        
        var data2 = [
          {
            value: Math.floor((Math.random()*100)+1),
            color:"#F38630"
          },
          {
            value : Math.floor((Math.random()*100)+1),
            color : "#E0E4CC"
          },
          {
            value : Math.floor((Math.random()*100)+1),
            color : "#69D2E7"
          }
        ]
        $scope.pieChart = {"data": data2, "options": {}};

    }]);
