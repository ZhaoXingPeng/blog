<template>
  <div>
    <!-- banner -->
    <div class="banner" :style="cover">
      <h1 class="banner-title">添加文章</h1>
    </div>
    <v-card class="mark-container" style="height: 90vh;">
    
        <mavon-editor v-model="context" :toolbars="toolbars" style="height:70vh; margin-top: 3vh;" />
    <div class="btn-box">
    <button class="btn">
        确认提交
    </button>
    </div>
    </v-card>
  </div>
</template>

<script>
export default {
  created() {
    this.listTalks();
  },
  data: function() {
    return {
      current: 1,
      size: 10,
      talkList: [],
      count: 0,
      previewList: [],
    //   =========
     context: ' ',//输入的数据
            toolbars: {
                bold: true, // 粗体
                italic: true, // 斜体
                header: true, // 标题
                underline: true, // 下划线
                mark: true, // 标记
                superscript: true, // 上角标
                quote: true, // 引用
                ol: true, // 有序列表
                link: true, // 链接
                imagelink: true, // 图片链接
                help: true, // 帮助
                code: true, // code
                subfield: true, // 是否需要分栏
                fullscreen: true, // 全屏编辑
                readmodel: true, // 沉浸式阅读
                undo: true, // 上一步
                trash: true, // 清空
                // save: true, // 保存（触发events中的save事件）
                navigation: true // 导航目录
            }
    };
  },
  methods: {

  },
  computed: {
    cover() {
      var cover = "";
      this.$store.state.blogInfo.pageList.forEach(item => {
        if (item.pageLabel == "talk") {
          cover = item.pageCover;
        }
      });
      return "background: url(" + cover + ") center center / cover no-repeat";
    },
    isLike() {
      return function(talkId) {
        var talkLikeSet = this.$store.state.talkLikeSet;
        return talkLikeSet.indexOf(talkId) != -1 ? "#eb5055" : "#999";
      };
    }
  }
};
</script>

<style scoped>
.btn-box{
  display: flex;
  justify-content: flex-end;
}
.btn{
    width: 80px;
    height: 40px;
    margin: 20px;
border-radius: 11px;
background: #12abde;
box-shadow: inset 12px 12px 18px #0f8cb6,
            inset -12px -12px 18px #15caff;
font: 15px/150% Arial,Verdana;  

}
</style>
