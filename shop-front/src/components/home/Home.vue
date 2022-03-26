<template>
  <a-layout>
    <a-layout-header>
      <Header/>
    </a-layout-header>
    <a-layout>
      <a-layout-sider>Sider</a-layout-sider>
      <a-layout-content>Content</a-layout-content>
      <a-layout-sider>Sider</a-layout-sider>
    </a-layout>
  </a-layout>
</template>

<script lang="ts">
import Header from "./Header.vue";

export default {
  name: "Home",
  components: {Header},
  data() {
    return {};
  },
};


</script>

<style lang="less" scoped>
.ant-layout {
  width: 100%;
  height: 100%;

  .ant-layout-header {
    height: 90px;
    background-color: #F5F5F5;
    padding: 0;
    box-sizing: content-box;
  }

  .ant-layout-sider {
    background: #3ba0e9;
    color: #fff;
    line-height: 120px;
    margin-top: 24px;
  }

  .ant-layout-content {
    background: rgba(16, 142, 233, 1);
    color: #fff;
    line-height: 120px;
    margin: 24px 16px;
    min-height: 120px;
  }
}

</style>
