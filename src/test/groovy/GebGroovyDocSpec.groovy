import geb.spock.GebSpec

class GebGroovyDocSpec extends GebSpec {
    def "can navigate packages"() {
        setup:
        def page = browser.to GebGroovyDoc

        when: "we navigate to the manual and filter to a speciifc package"
        page.browsePackage('geb.binding')

        then: "we get classes from the expected package"
        page.find('a', href: 'BindingUpdater.html').text() == 'BindingUpdater'
    }
}
