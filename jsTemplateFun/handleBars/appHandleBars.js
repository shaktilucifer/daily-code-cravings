$(document).ready(function () {
    var peopleObject = {
        people: [
            "smogon",
            "imprfectluck",
            "lucifer"
        ],
        nestedPeople: [
            {
                smogon: {
                    firstName: "smog"
                }
            }
        ]
    };

    var hbsRenderedElement = handleBarsCompileAndDataBind
        (
        $("#entry-template")
        , peopleObject
        )
    $("#peopleList").html(hbsRenderedElement);
    //Testing with button event
    togglerButtonEvent();
});

function togglerButtonEvent() {
    $("#togglerBtn").on("click", function () {
        
        var togHbsEl = handleBarsCompileAndDataBind
        (
        $("#entry-template")
        , {
            people: [
                "smog",
                "impl",
                "lucy"
            ]
        }
        );
        $("#peopleList").html(togHbsEl);
    });
}

function handleBarsCompileAndDataBind(template, data) {
    var source = template.html();
    var template = Handlebars.compile(source);
    return template(data);
}