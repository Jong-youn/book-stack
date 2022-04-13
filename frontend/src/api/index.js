import axios from 'axios';

function fetchBookSearchList(query) {
  const url = "/v1/search/book.json?query="
  const config = {
    headers: {
      'X-Naver-Client-Id': 'hoVxHr2GQBXEWqFyojHp',
      'X-Naver-Client-Secret': 'n_T3SmEDM5',
    }
  }

  return axios.get(url + query, config);
}

export { fetchBookSearchList }