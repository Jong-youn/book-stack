<template>
  <div class="wrap">
    <div class="input-group"> 
      <input type="search" class="form-control"> 
      <span class="input-group-addon">
        <input type="submit" value="Search" class="btn">
      </span> 
    </div>
    <!-- <%= form_with(url: search_path, method: "get", local: true) do |form| %>
            <div class="input-group"> 
              <%= form.search_field :query, class: "form-control" %>
              <%= form.submit "Search", type: "submit", class: "btn btn-primary" %>
            </div>
          <% end %>  -->
  </div>
</template>

<script>
export default {

}
</script>

<style scoped>
.btn {
  padding: 0 54px;
  line-height: 60px;
  background-color: #42b883;
  color: white;
}

.input-group {
    -webkit-box-shadow: 0px 4px 18px 0px rgba(0, 0, 0, 0.1);
    box-shadow: 0px 4px 18px 0px rgba(0, 0, 0, 0.1)
}

.input-group-addon {
    border: none
}

.form-control {
    height: 60px;
    border-radius: 0;
    border: none
}

.form-control:focus {
    box-shadow: 0px 0px 0px 0px #ffffff !important
}

.input-group .input-group-addon [type="submit"],
.input-group .input-group-addon button {
    border: none;
    border-radius: 0
}
</style>