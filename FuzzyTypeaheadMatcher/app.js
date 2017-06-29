$(document).ready(function() {

    var veggies = [
        "Kidney Beans",
        "Gourd",
        "Drumstick",
        "onions",
        "Peas",
        "Zucchini",
        "okra"
    ];

    var books = [{
        "title": "Pancreas",
        "author": "John Doe"
    }, {
        "title": "breasts",
        "author": "..."
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
