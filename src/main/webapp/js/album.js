Vue.component('song_table',{
    props:['musiclist'],
    template: `<table class="table table-striped">
                <tbody>
                <tr>
                    <th>歌曲</th>
                    <th>歌手</th>
                    <th>时长</th>
                </tr>
                <tr v-for="song in musiclist">
                <td>{{song.music_name}}</td>
                <td>{{song.songer.songer_name}}</td>
                <td>{{song.duration}}</td>
                </tr>
                </tbody>
            </table>`
})
var vm=new Vue({
    el:"#main",
    data:{
        album:{},
        musicList:[]
    },
    mounted:function () {
        this.load_album();
    },
    methods:{
        load_album:function () {
            var search = location.search;
            var index=search.indexOf("=")
            var album_id= search.substring(index+1,search.length)
            axios.get("/load/load_album?album_id="+album_id).then(function (response) {
                if(response.data.code==200) {
                    vm.album = response.data.map.album;
                    vm.musicList=response.data.map.musicList;
                }
                else alert("加载失败!")
            })
        }
    }
})