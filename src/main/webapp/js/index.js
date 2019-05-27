Vue.component('song-rank',{
    props:['song'],
    methods:{
        getSong:function () {
            window.location.href="/html/song.html?music_id="+this.song.music_id
        },
        getSonger:function () {
            window.location.href="/html/songer.html?songer_id="+this.song.songer.songer_id
        }
    },
    template:`<li> <a href="javascript:void(0)" v-on:click="getSong">{{song.music_name}}</a> <br/>
               <a href="javascript:void(0)" v-on:click="getSonger">{{song.songer.songer_name}}</a> </li>`
})

Vue.component('sheet-recommend',{
    props:['sheet'],
    template: `<div class="music_list">
                    <img v-bind:src="sheet.list_img">
                    <a> {{sheet.list_name}} </a><br/>
                    <span>播放量:{{sheet.volume}} </span>
                </div>`
})

Vue.component('song-recommend',{
    props:['music'],
    methods:{
        getSong:function () {
            window.location.href="/html/song.html?music_id="+this.music.music_id
        },
        getSonger:function () {
           window.location.href="/html/songer.html?songer_id="+this.music.songer.songer_id
        }
    },
    template: `<div class="music_play">
                   <img v-bind:src="music.music_img">
                   <div class="detail_panel">
                       <h5><a href="javascript:void(0)" v-on:click="getSong">{{music.music_name}}</a></h5>
                       <p><span id="a_songer"><a href="javascript:void(0)" v-on:click="getSonger">{{music.songer.songer_name}}</a></span></p>
                   </div>
                   <div class="time_panel">
                       {{music.duration}}
                   </div>
               </div>`
})

Vue.component('album-recommend',{
    props:['album'],
    methods:{
        getSonger:function (){
            window.location.href="/html/songer.html?songer_id="+this.album.songer.songer_id
        }
    },
    template: `<div class="music_list">
                    <img v-bind:src="album.album_img">
                    <a> {{album.album_name}} </a><br/>
                    <span id="a_songer"><a href="javascript:void(0)" v-on:click="getSonger">{{album.songer.songer_name}}</a> </span>
                </div>`
})

var vm=new Vue({
    el:"#main",
    data:{
        musicList:null,
        albumList:null,
        sheetList:null,
        rank_popular:null,
        rank_hot:null,
        rank_new:null,
        rank_eu:null,
        rank_korea:null
    },
    mounted:function () {
        this.loadindex();
    },
    methods:{
        loadindex:function () {
            axios.get('/load/index').then(function (response) {
                vm.musicList=response.data.map.musicList;
                vm.albumList=response.data.map.albumList;
                vm.sheetList=response.data.map.musicsheetList;
                vm.rank_popular=response.data.map.rank_style;
                vm.rank_hot=response.data.map.rank_hot;
                vm.rank_eu=response.data.map.rank_eu;
                vm.rank_korea=response.data.map.rank_korea;
                vm.rank_new=response.data.map.rank_new;
            })
        }
    }
})
