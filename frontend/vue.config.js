const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
    client: {
      overlay: false
    },
    proxy: {
      '^/v1': {
        target: "https://openapi.naver.com",
        // pathRewrite: { '^/v1': '' },
        changeOrigin: true,
        // logLevel: 'debug',
      }
    }
  }
})
