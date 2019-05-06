var vm=new Vue({
    el:"",
    data:{
        music:{},
        music_id:'',
        music_name:'',
        songer_name:'',
        album_name:'',
        corporation:'',
        releasedate:'',
        music_img:''
    },
    mounted:function () {
        this.load_song();
    },
    methods:{
        load_song:function () {
            var search = location.search;
            var index=search.indexOf("=")
            var music_id=search.substring(index+1,search.length-1)
            axios.get("/load/load_song?music_id="+music_id).then(function (response) {
                if(response.data.map.code==200)
                vm.music=response.data.map.music;
                else alert("加载失败!")
            })
        }
    }
})