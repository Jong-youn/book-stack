<template>
  <div class="header">
    <nav class="container navbar navbar-dark navbar-expand-lg" >
      <a class="navbar-brand" href="#">Book Stack</a>

      <div class="font-weight-normal collapse navbar-collapse d-flex justify-content-between" id="navbarNav">
        <ul class="navbar-nav mr-auto mt-lg-0">
          <li class="nav-item">
            <a class="nav-link text-white" href="#">내 서재</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-white" href="#">위시리스트</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-white" href="#">서평</a>
          </li>
        </ul>
          <!-- <span class="navbar-text text-white px-1"><%= current_user.nickname %> 님</span>
          <%= link_to "| 로그아웃", logout_path, class: "nav-link text-white px-1" %> -->
        <ul class="navbar-nav my-2 my-lg-0">
          <li class="nav-item">
            <a class="nav-link text-white" href="#">회원가입</a>
          </li>
          <li class="nav-item">
            <a class="nav-link text-white" href="#">로그인</a>
          </li>
        </ul>
      </div>
    </nav>
  </div>
</template>

<script>
export default {

}
</script>

<style scoped>
.header {
  background-color: #42b883;
  color: white;
}
.navbar-brand {
  font-weight: 600;
}
</style>