<template>
  <div class="row domain-search">
    <div class="search-container">
      <div class="row">
        <div class="col-md-3">
          <h2 class="form-title">Find Your <strong>Dream Book</strong></h2>
          <p>Search for your dream book now</p>
        </div>
        <div class="col-md-9">
          <search-form></search-form>
        </div>
      </div>
      <hr>
      <div class="result-container row m-1 p-3 px-5">
        <div class="container profile-page">
          <div class="row">
            <!-- <book-card></book-card> -->
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import SearchForm from './SearchForm.vue'
// import BookCard from '../layout/BookCard.vue'

export default {
  components: {
    SearchForm,
    // BookCard  
  }
}
</script>

<style scoped>
.domain-search {
    margin: 0;
    padding: 206px 0
}

.domain-search .form-title {
    margin-top: 0;
    margin-bottom: 2px;
    color: #42b883;
    font-family: "Poppins", sans-serif;
    font-weight: 100
}

.domain-search p {
    color: #2e7957;
    margin: 0
}

.domain-search .form-title strong {
    display: block
}

</style>