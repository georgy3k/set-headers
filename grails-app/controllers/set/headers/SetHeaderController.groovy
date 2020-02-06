package set.headers

class SetHeaderController {

    def afterInterceptor = { model ->
        setHeaders()
    }

    def index() {}

    def test() {
        render "test"
    }

    private void setHeaders() {
        response.addHeader("test", "testing")
    }
}
