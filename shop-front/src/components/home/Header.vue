<template>
  <a-row id="header">
    <a-col :span="14"></a-col>
    <a-col :span="10">
      <a-space :size="spaceSize">
        Space
        <a-button type="primary">Button01</a-button>
        <a-button type="primary">{{ spaceSize }}</a-button>
      </a-space>
    </a-col>
  </a-row>
</template>

<script lang="ts">
export default {
  name: "Header",
  components: {},
  data() {
    return {
      spaceSize: 8,
      headerTitle: '首页',
      headerSubTitle: '这里是首页'
    };
  },
}
</script>

<style lang="less" scoped>
#header {
  border-bottom: 1px solid gray;
  height: 100%;
  color: black;
}
</style>
