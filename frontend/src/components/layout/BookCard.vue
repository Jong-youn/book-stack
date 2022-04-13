<template>
  <div class="col-xl-6 col-lg-7 col-md-12 book-card">
    <div class="card profile-header">
      <div class="body">
        <div class="row">
          <div class="col-lg-4 col-md-4 col-12">
            <!-- <div class="profile-image float-md-right"> <img src=<%= list.book.image %> alt="book image"> </div> -->
          </div>
          <div class="col-lg-8 col-md-8 col-12 book-information">
            <!-- <div class="book-title">
              <h5 class="m-t-0 m-b-0"><strong><%= list.book.title.html_safe %></strong></h5>
            </div>
            <div class="book-contents">
              <div class="book_post"><%= list.book.author.html_safe %></div>
              <div class="book_post"><%= list.book.publisher.html_safe %></div>
              <div class="book_post"><%= list.book.publication_date.year %></div>
            </div>
            <div class="add-book">
              <% if wishlist %>
                <i class="fas fa-check"></i><%= link_to "내 서재에 추가", wishlist_path(book_id: list.book_id), method: :post %>
              <% end %>
            </div> -->
          </div>                
        </div>
      </div>                    
    </div>
  </div>
</template>

<script>
export default {

}
</script>

<style>

</style>