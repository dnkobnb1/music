var vm=new Vue({
    el:"#main",
    data:{
        music:{},
    },
    mounted:function () {
        this.load_song();
    },
    methods:{
        load_song:function () {
            var search = location.search;
            var index=search.indexOf("=")
            var music_id=search.substring(index+1,search.length)
            axios.get("/load/load_song?music_id="+music_id).then(function (response) {
                if(response.data.code==200)
                vm.music=response.data.map.music;
                else alert("加载失败!")
            })
        }
    }
})