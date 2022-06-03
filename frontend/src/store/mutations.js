export default {
  SET_BOOK_SEARCH_RESULT(state, books) {
    state.searchedBook = books;
    state.searchLoaded = true;
  }
}