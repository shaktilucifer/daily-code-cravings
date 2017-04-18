
$(document).ready(function(){
    var states = ['Alabama', 'Alaska', 'Arizona', 'Arkansas', 'California',
  'Colorado', 'Connecticut', 'Delaware', 'Florida', 'Georgia', 'Hawaii',
  'Idaho', 'Illinois', 'Indiana', 'Iowa', 'Kansas', 'Kentucky', 'Louisiana',
  'Maine', 'Maryland', 'Massachusetts', 'Michigan', 'Minnesota',
  'Mississippi', 'Missouri', 'Montana', 'Nebraska', 'Nevada', 'New Hampshire',
  'New Jersey', 'New Mexico', 'New York', 'North Carolina', 'North Dakota',
  'Ohio', 'Oklahoma', 'Oregon', 'Pennsylvania', 'Rhode Island',
  'South Carolina', 'South Dakota', 'Tennessee', 'Texas', 'Utah', 'Vermont',
  'Virginia', 'Washington', 'West Virginia', 'Wisconsin', 'Wyoming'
];

var books = [{"title":"Pancreas", "author":"John Doe"}, {"title":"breasts", "author":"..."}];
var fuzzyhound = new FuzzySearch({source:states});
$('#typeahead-input').typeahead({
            minLength: 2,
            highlight: false //let FuzzySearch handle highlight
        },
        {
            name: 'states',
            source: fuzzyhound,
            templates: {
                suggestion: function(result){return "<div>"+fuzzyhound.highlight(result)+"</div>"}
            }
        });

});