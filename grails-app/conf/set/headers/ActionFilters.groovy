package set.headers

class ActionFilters {

    def filters = {
        all(controller:'*', action:'*') {
            before = {

            }
            after = { Map model ->
                log.info("ActionFilters after: URI - ${actionUri} - 'before-test' header exists - " + response.containsHeader("before-test"))
                log.info("ActionFilters after: URI - ${actionUri} - 'after-test' header exists - " + response.containsHeader("after-test"))
            }
            afterView = { Exception e ->

            }
        }
    }
}
