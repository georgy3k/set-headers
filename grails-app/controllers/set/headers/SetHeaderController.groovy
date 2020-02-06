package set.headers

class SetHeaderController {

    def beforeInterceptor = [action: this.&setBeforeHeaders]

    def afterInterceptor = { model ->
        setAfterHeaders()
    }

    // Works for beforeInterceptor & afterInterceptor
    def index() {}

    // Works for beforeInterceptor only, issue being the 'render'
    def test() {
        render "test"
    }

    private void setBeforeHeaders() {
        response.addHeader("before-test", "testing")
    }

    private void setAfterHeaders() {
        response.addHeader("after-test", "testing")
    }
}
