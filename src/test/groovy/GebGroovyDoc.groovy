import geb.Page
import org.openqa.selenium.By

class GebGroovyDoc extends Page {

    static url = '/manual/current/api/'

    static at = {
        title.startsWith("Overview (Groovy API")
    }

    static content = {
        mainFrame { $('frame', name: 'classFrame') }
    }

    def browsePackage(String packageNameToClick) {
        withFrame(mainFrame, Page, {
            $('a').find(By.linkText(packageNameToClick)).click()
        })
        waitFor {
            withFrame(mainFrame, PackagePage, {
                packageTitle.text() == packageNameToClick
            })
        }
    }

}
