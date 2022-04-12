<template>
  <form class="wrap" method="get">
    <div class="input-group"> 
      <input type="search" class="form-control" v-model="keyword" v-on:keyup.enter="focusSearchInput(keyword)"> 
      <span class="input-group-addon" v-on:click.prevent="focusSearchInput(keyword)">
        <input type="submit" value="Search" class="btn">
      </span> 
    </div>
  </form>
</template>

<script>
// import { mapActions } from 'vuex'
import axios from 'axios';

export default {
  data() {
    return {
      keyword: "",
      items: []
    }
  },
  methods: {
    focusSearchInput(query) {
      const url = "/v1/search/book.json?query="
      const config = {
        headers: {
          'X-Naver-Client-Id': 'hoVxHr2GQBXEWqFyojHp',
          'X-Naver-Client-Secret': 'n_T3SmEDM5',
        }
      }

      if (query !== '') {
        axios.get(url + query, config)
        .then(response => {
          console.log(response.data)
        })
        .catch(error => {
          console.log(error)
        })
      } else {
        console.log('검색어를 입력하세요')
      }
    }
  }
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