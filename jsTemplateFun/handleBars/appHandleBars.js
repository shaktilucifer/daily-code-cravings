$(document).ready(function(){
var source   = $("#entry-template").html();
var template = Handlebars.compile(source);
var peopleObject = {
    people: [
    "smogon",
    "imprfectluck",
    "lucifer"
]};
var hbsRenderedElement = template(peopleObject); 
console.log(hbsRenderedElement);
$("#peopleList").append(hbsRenderedElement);
});