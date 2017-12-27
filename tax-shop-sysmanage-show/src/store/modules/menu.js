const menu = {
  state: {
    title: '', // 文章题目
    content: '', // 文章内容
    content_short: '', // 文章摘要
    source_uri: ''
  },
  mutations: {
    SET_TITLE: (state, title) => {
      state.title = title
    },
    SET_CONTENT: (state, content) => {
      state.content = content
    },
    SET_CONTENT_SHORT: (state, content_short) => {
      state.content_short = content_short
    },
    SET_SOURCE_URI: (state, source_uri) => {
      state.source_uri = source_uri
    }
  }
}
