package set.headers

class ActionFilters {

    def filters = {
        all(controller:'*', action:'*') {
            before = {

            }
            after = { Map model ->
                log.info("ActionFilters after: 'test' header exists - " + response.containsHeader("test"))
            }
            afterView = { Exception e ->

            }
        }
    }
}
