<template>
  <div id="app">
    <header-bar></header-bar>
    <div class="container"><router-view></router-view></div>
    <footer-bar></footer-bar>
  </div>
</template>

<script>
import HeaderBar from './components/layout/HeaderBar.vue'
import FooterBar from './components/layout/FooterBar.vue'

export default {
  components: {
    HeaderBar,
    FooterBar
  }
}
</script>

<style>
body {
  margin: 0;
}
</style>
