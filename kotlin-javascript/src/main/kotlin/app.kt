import kotlinx.html.*
import kotlinx.html.dom.create
import kotlinx.html.js.div
import kotlinx.html.js.onClickFunction
import kotlinx.html.js.onSubmitFunction
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLFormElement
import org.w3c.dom.events.Event
import org.w3c.xhr.FormData
import org.w3c.xhr.XMLHttpRequest
import kotlin.browser.document

class Superhero(val name: String, val superpower: String)

val appContent = document.create.div {
    h1 {
        +"Superhero Registry"
    }

    form  {
        method = FormMethod.post
        onSubmitFunction = send()

        div(classes = "form-group") {
            label {
                +"name"
                for_ = "superheroName"
            }
            textInput(classes = "form-control") {
                placeholder = "name"
                name = "name"
            }
        }
        div(classes = "form-group") {
            label {
                +"super power"
                for_ = "superheroPower"
            }
            textInput(classes = "form-control") {
                placeholder = "power"
                name = "superpower"
            }
        }

        button(classes = "btn btn-default", type = ButtonType.submit) {
            +"submit"
        }
    }
}


fun getUlList(superheroes: Array<Superhero>): HTMLElement {
    return document.create.ul {
        for (superhero in superheroes) li {
            +"${superhero.name}  ${superhero.superpower}"
        }
    }
}

fun send(): (Event) -> Unit {
    return fun(event:Event) {
        val request: dynamic = XMLHttpRequest()
        request.open("POST", "http://localhost:8080/superheroes", true)
        request.send(FormData(event.currentTarget as HTMLFormElement))
    }
}

fun receive() {
    val responseContentContainer = document.getElementById("responseContent") as HTMLDivElement
    val request: dynamic = XMLHttpRequest()
    request.open("GET", "http://localhost:8080/superheroes", true)
    request.onload = fun() {
        responseContentContainer.append(getUlList(JSON.parse<Array<Superhero>>(request.responseText)))
    }
    request.send()
}

fun main(args: Array<String>) {
    val appContentContainer = document.getElementById("appContent") as HTMLDivElement
    appContentContainer.append(appContent)
    receive()
}


