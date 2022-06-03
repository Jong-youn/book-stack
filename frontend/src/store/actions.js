import { fetchBookSearchList } from '../api/index.js'

export default {

  FETCH_SEARCH_RESULT(context, query) {
    fetchBookSearchList(query)
    .then(response => {
      console.log(response.data)
      context.commit('SET_BOOK_SEARCH_RESULT', response.data);
    })
    .catch(error => {
      console.log(error)
    })
  }
}