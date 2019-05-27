Vue.component('song_table',{
    props:['musiclist'],
    methods:{
        getSonger:function (){
            window.location.href="/html/songer.html?songer_id="+this.music.songer.songer_id
        }
    },
    template: `<table class="table table-striped">
                <tbody>
                <tr>
                    <th>歌曲</th>
                    <th>专辑</th>
                    <th>时长</th>
                </tr>
                <tr v-for="song in musiclist">
                <td>{{song.music_name}}</td>
                <td v-if="song.album">{{song.album.album_name}}</td>
                <td v-else>无</td>
                <td>{{song.duration}}</td>
                </tr>
                </tbody>
            </table>`
})
var vm=new Vue({
    el:'#main',
    data:{
        songer:{},
        sum_song:'',
        sum_album:'',
        musicList:null
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
                    vm.musicList=response.data.map.musicList;
                }
            })
        }
    }
})