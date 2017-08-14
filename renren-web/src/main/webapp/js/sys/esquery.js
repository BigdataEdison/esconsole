$(function () {
	var urlName = getUrlParam("name");
	console.log('name', name);
    $("#jqGrid").jqGrid({
        url: '../sys/esquery/list?name='+urlName,
        datatype: "json",
        ajaxGridOptions: { contentType: 'application/json;charset=utf-8	'},
        colModel: [			
			{ label: 'id', name: 'id', width: 30, key: true },
			{ label: '部门', name: 'department', width: 90 },
			{ label: '集群', name: 'name', width: 100 }, 
			{ label: '节点', name: 'nodes', width: 30 }, 			
			{ label: '索引', name: 'es_indices', width: 30 }, 
			{ label: 'GoProxyPort', name: 'port', width: 50 }, 
			{ label: 'Link', name: 'link', width: 70, formatter: selfFormat}, 
			{ label: 'SOA', name: 'soa_reginfo', width: 100},
			{ label: 'Huskar', name: 'huskar_registered', width: 30 }
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: false,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

function selfFormat(cellvalue, options, rowdata){
	return '<a href="'+cellvalue+'"><img src="es.png" width="20px"/></a>'
}

function getUrlParam(name)
{
	var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
	var r = window.location.search.substr(1).match(reg); //匹配目标参数
	if (r!=null) return unescape(r[2]); return null; //返回参数值
} 

var vm = new Vue({
	el:'#rrapp',
	data:{
		q:{
			key: null
		},
	},
	methods: {
		query: function () {
			vm.reload();
		},
		reload: function (event) {
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
				postData:{'key': vm.q.key},
                page:page
            }).trigger("reloadGrid");
		}
	}
});