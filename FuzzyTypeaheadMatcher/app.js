$(document).ready(function() {

    var veggies = [
        "onions",
        "Peas",
        "Zucchini",
        "okra"
    ];

    var books = [{
        "title": "Kill a mockingjaybird",
        "author": "John Doe"
    }, {
        "title": "blueberry finn",
        "author": "mike twaing"
    }];
    var fuzzyhound = new FuzzySearch({
        source: veggies
    });
    $('#typeahead-input').typeahead({
        minLength: 1,
        highlight: false //let FuzzySearch handle highlight
    }, {
        name: 'veggie',
        source: fuzzyhound,
        templates: {
            suggestion: function(result) {
                return "<div>" + fuzzyhound.highlight(result) + "</div>"
            }
        }
    }).bind('typeahead:change', function(obj, datum) {
        console.log("changed value" + datum);
    });


});
