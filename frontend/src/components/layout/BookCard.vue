<template>
  <div class="col-xl-6 col-lg-7 col-md-12 book-card">
    <div class="card profile-header">
      <div class="body">
        <div class="row">
          <div class="col-lg-4 col-md-4 col-12">
            <div class="profile-image float-md-right"> <img :src="book.image" alt="book image"> </div>
          </div>
          <div class="col-lg-8 col-md-8 col-12 book-information">
            <div class="book-title">
              <h5 class="m-t-0 m-b-0"><strong>{{ book.title }}</strong></h5>
            </div>
            <div class="book-contents">
              <div class="book_post">{{ book.author }}</div>
              <div class="book_post">{{ book.publisher }}</div>
              <div class="book_post">{{ book.publication_date }}</div>
            </div>
            <div class="add-book">
              <i class="fas fa-check"></i><a href="">내 서재에 추가</a>
              <i class="fas fa-check"></i><a href="">위시리스트에 추가</a>
            </div>
          </div>                
        </div>
      </div>                    
    </div>
  </div>
</template>

<script>
export default {
  props: ['book']
}

</script>

<style scoped>
.book-contents {
  margin: 3% auto;
}

.book-title > h5 {
    overflow: hidden;
    display: -webkit-box;
    -webkit-line-clamp: 2;
    -webkit-box-orient: vertical; 
}

.book-contents > .book_post {
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
}


.card {
  background: #fff;
  margin-bottom: 30px;
  transition: .5s;
  border: 0;
  border-radius: .1875rem;
  display: inline-block;
  position: relative;
  width: 100%;
  box-shadow: none;
}

.card .body {
  font-size: 14px;
  color: #424242;
  padding: 4%;
  font-weight: 400;
}

.profile-page .profile-header {
  position: relative
}

.profile-image {
  width: 100%;
}

.profile-page .profile-header .profile-image img {
  width: 100%;
  border: 3px solid #fff;
  box-shadow: 0 3px 6px rgba(0, 0, 0, 0.16), 0 3px 6px rgba(0, 0, 0, 0.23)
}

.card> .body> .row {
  margin: 0;
  height: 162px;
}

.profile-page .profile-header .social-icon a {
  margin: 0 5px
}

.profile-page .profile-sub-header {
  min-height: 60px;
  width: 100%
}

.profile-page .profile-sub-header ul.box-list {
  display: inline-table;
  table-layout: fixed;
  width: 100%;
  background: #eee
}

.profile-page .profile-sub-header ul.box-list li {
  border-right: 1px solid #e0e0e0;
  display: table-cell;
  list-style: none
}

.profile-page .profile-sub-header ul.box-list li:last-child {
  border-right: none
}

.profile-page .profile-sub-header ul.box-list li a {
  display: block;
  padding: 15px 0;
  color: #424242
}

.domain-search {
  margin: 0;
  padding: 100px 0
}

.search-result {
  padding-top: 1%;
}

.domain-search .form-title {
  margin-top: 0;
  margin-bottom: 2px;
  color: #007bff;
  font-family: "Poppins", sans-serif;
  font-weight: 100
}

.domain-search p {
  color: #424242;
  margin: 0
}

.domain-search .input-group {
  -webkit-box-shadow: 0px 4px 18px 0px rgba(0, 0, 0, 0.1);
  box-shadow: 0px 4px 18px 0px rgba(0, 0, 0, 0.1)
}

.domain-search .input-group-addon {
  border: none
}

.domain-search .form-title strong {
  display: block
}

.domain-search .form-control {
  height: 62px;
  border-radius: 0;
  border: none
}

.domain-search .form-control:focus {
  box-shadow: 0px 0px 0px 0px #ffffff !important
}

.input-group .input-group-addon [type="submit"],
.input-group .input-group-addon button {
  border: none;
  border-radius: 0
}

.domain-search .btn {
  padding: 0 54px;
  line-height: 60px
}

.btn-primary {
  padding: 0 28px;
  line-height: 54px;
  background: #ff6726;
  color: #fff
}

.btn-primary:hover {
  color: #fff;
  background-color: #286090;
  border-color: #204d74
}

.domain-search .input-group+p {
  color: #fff;
  font-size: 15px;
  font-family: "Poppins", sans-serif;
  font-weight: 100;
  margin-top: 15px;
  margin-bottom: 0
}

.domain-search .input-group+p strong {
  margin-right: 40px
}

.add-book {
  font-size: 1.0rem;
}

.add-book > a {
  margin-right: 0.3rem;
  color: #424242;
}

.fa-check {
  color: #0362c9;
  margin-right: 0.2rem;
  /* color: #f782ac; */
}
</style>