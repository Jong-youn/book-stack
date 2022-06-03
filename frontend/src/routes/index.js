import Vue from 'vue'
import VueRouter from 'vue-router';

import MainView from '../components/home/MainView.vue';
import SignUpView from '../components/SignUpView.vue';
import LoginView from '../components/LoginView.vue';
import ReviewView from '../components/ReviewView.vue';
import WishlistView from '../components/WishlistView.vue';
import LibraryView from '../components/LibraryView.vue';

Vue.use(VueRouter);


export const router = new VueRouter({
  mode: 'history',
  routes: [
    {
      path: '/',
      component: MainView 
    },
    {
      path: '/user/signup',
      component: SignUpView 
    },
    {
      path: '/user/login',
      component: LoginView 
    },
    {
      path: '/review',
      component: ReviewView 
    },
    {
      path: '/wishlist',
      component: WishlistView 
    },
    {
      path: '/library',
      component: LibraryView 
    }
  ]
})