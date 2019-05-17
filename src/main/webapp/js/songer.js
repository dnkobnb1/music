var vm=new Vue({
    el:'#main',
    data:{
        songer:{},
        sum_song:'',
        sum_album:''
    },
    mounted:function () {
        this.load_songer()
    },
    methods:{
        load_songer:function () {
            var search = location.search;
            var index=search.indexOf("=")
            var songer_id=search.substring(index+1,search.length)
            axios.get("/load/load_songer?songer_id="+songer_id).then(function (response) {
                if(response.data.code=200) {
                    vm.songer = response.data.map.songer;
                    vm.sum_song=response.data.map.sum_song;
                    vm.sum_album=response.data.map.sum_album;
                }
            })
        }
    }
})