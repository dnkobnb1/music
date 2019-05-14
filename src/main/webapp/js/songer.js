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
            axios.get()
        }
    }
})