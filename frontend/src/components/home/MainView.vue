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
      <div v-if="searchLoaded" class="search-result">
        <hr>
        <p>검색 결과 {{ searchCount }}개</p>
        <div class="result-container row m-1 p-3 px-5">
          <div class="container profile-page">
            <div class="row">
              <book-card v-for="book in books" v-bind:key=book.isbn v-bind:book='book'></book-card>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { mapState } from 'vuex';
import SearchForm from './SearchForm.vue'
import BookCard from '../layout/BookCard.vue'

export default {
  computed: {
    ...mapState({
      searchCount: state => state.searchedBook.display,
      searchLoaded: state => state.searchLoaded,
      books: state => state.searchedBook.items
    })
  },
  components: {
    SearchForm,
    BookCard  
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

.search-result hr {
    margin-top: 5%;
}

.search-result p {
    color: black;
    font-weight: 400;
}
</style>