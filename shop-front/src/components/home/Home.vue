<template>
  <div id="home">
    <div id="text">{{text}}</div>
  </div>
</template>

<script lang="ts">
import home from './home.components'

export default {
  ...home
}
</script>

<style lang="less" scoped>
@import "./home.components";
</style>