<script id="datasets-template" type="text/x-handlebars-template">
    <ul class="uk-nav uk-nav-dropdown single-select dataset-options radio-options">
        {{#with data}}
        {{#each this}}
        <li class="{{@root/scope}}dataset-option" rel="dataset" value="{{this}}"><a href="#">{{this}}</a></li>
        {{/each}}
        {{/with}}
    </ul>
</script>