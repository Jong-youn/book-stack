<template>
  <ul>
    <li v-for="book in books" v-bind:key=book.isbn>
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
                <!-- <div class="add-book">
                  <% if wishlist %>
                    <i class="fas fa-check"></i><%= link_to "내 서재에 추가", wishlist_path(book_id: list.book_id), method: :post %>
                  <% end %>
                </div> -->
              </div>                
            </div>
          </div>                    
        </div>
      </div>
    </li>
  </ul>
</template>

<script>
import { mapState } from 'vuex';

export default {
  computed: {
    ...mapState({
      books: state => state.searchedBook.items
    })
  }
}
</script>

<style scoped>
ul {
  list-style-type: none;
  padding-left: 0px;
  margin-top: 0;
  text-align: left;
}
li {
  display: flex;
  height: 150px;
  line-height: 50px;
  /* margin: 0.5rem 0; */
  padding: 0 0.9rem;
  background: white;
  border-radius: 5px;
}
</style>