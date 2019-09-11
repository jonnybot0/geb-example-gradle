import geb.Page

class PackagePage extends Page {
    static content = {
        packageTitle { $('h1', class: "title") }
    }
}
