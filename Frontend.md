HTML - hyper text markup language



-> is the standard markup language used to create and structure web pages, it tells the browser how content such as headings, paragraphs,

&#x09;images, links, tables, and form should be organized.



Types of Web:

&#x09;two types -> 1. static

&#x09;	     2. dynamic



Feature		Static Web		Dynamic Web



content		fixed			changes dynamically

technologies	html, CSS, JS		html, CSS, JS, backend, database

Database	usually not required	usually required

Login system	usually not available	commonly available







Static Websites : it use to precreated html page to the browser, the content remains same unless the developer changes the html file and it is used to develop personal portfolios, college info page, documentation website.



Dynamic Website : it generates content based on user input, database data, login info, or other conditions.

&#x09;ex: banking applications.



==> <meta charset="UTF-8">



part	Meaning



<meta>	provides info about the html doc

charset	specifies the character encoding

UTF-8 	encoded standard used to represent characters



Basic html uses :-



* <!DOCTYPE html> => tells browser this is HTML5
* <html> => not element
* <head> => metadata
* <title> => browser tab title
* <body> => visible page content
* <h1> => heading
* <p> => paragraph



Text and Links : 

h1 - h6 is a heading tag.

p is a paragraph tag.

strong is for important tag.

mark is for highlighting the content.

br is for line break.

hr is for horizontal line.



List :- is used to display a collection of related items, it contains 3 imp types 

&#x09;1. ordered 

&#x09;2. unordered

&#x09;3. description





Tables :- an html table displays data in rows and columns.

&#x09;tags : table, thead, tbody, tr, th, td, tfoot

IMG :-

Images is used to display an element image on webpage using image tag and it is self closing tag



Forms :-

it collects info from users for getting the info and the common form controls.

1. text input
2. email
3. password
4. number
5. date
6. radio
7. select
8. submit button







HTML FORM VALIDATION :

form validation allow browser to check user input before form submission.



semantics: 

uses meaningful element that describes the purpose of their content.



SVG - scalable vector graphics is an xml based format, for creating vector graphs and graphics.





HTML + JavaScript :-


CSS3 :- cascading style sheet 
is used to control the appearance, layout, colors, spacing, fonts, and responsiveness of a html element.

Types of CSS
1. Inline CSS :- using style attribute we define the styling.
2. Internal CSS :- in head tag we use style tag and write the styling.
3. External CSS :- use external CSS file and link it to the html then write styling.
	is generally preferred for large projects because style can be reuse across multiple html pages.

CSS Selector :-
are the patterns used to select html element, that you want to style with css 
	1. selector :- h1 is a selector, it selects all h1 elements in html page.
	2. universal selector :- it selects all the html element on the page.
	3. class selector :- it selects the html element using the class attribute.
	4. id selector :- it selects the html element using the id attribute.

Color 
it supports several formats
1. color name
2. hexa value
3. rgb - red, green, blue
4. rgba - red, green, blue, alpha

Text Properties
it provides many properties for controlling text
1. color - to specify the color or change the color
2. text align - to specify the text position
3. text decoration - used for removes or add underline 
4. text transform - used to convert a lower case element to upper case or wise versa 
5. letter spacing
6. word spacing
7. line height

Fonts
controls the appearance of a text 
1. font-size
2. font weight
3. font style

CSS UNITS
Unit 		Meaning
1.px 		pixel value - text
2. % 		img, container - 
3. em		relative to parent font size 
4. rem 		relative to root font size 

display flex -> converts an element into a flex container.

flex-wrap -> determines whether the flex item should move to next line, whenever there is an enough space.

align-items -> controls alignment along the cross axis


BootStrap

is a popular frontend CSS framework used to build responsive, mobile first website quickly using prebuilt css classes and js components.

container :- is a layout component that provides a responsive fixed width area for a pitch contain.


ES6 :- ecma script -> is a major version of js that introduce modern syntax and features to make js code easier, cleaner, more readable and easy to maintain.

Important ES6 features
1. let -> declare a block scoped variable whose value can be changed.
2. const -> declare a block scoped variable whose binding cannot be reassigned 
3. arrow function -> provides a shorter syntax, for function also used lexical this rather than creating their own
	syntax :- const add = (a, b) => {
			return a * b;
		  }

React :

	const app() => {
		return (
		<h1>Hello</h1>
		)
	 }
	export default app;



Template literals :

uses backticks ( ` ) and $ with pair of {} to insert expression into strings and they also supports multiple strings.
	ex :-
const app() => {
    const name = "Ram";
	return (
	<h1>`Hello${name}`</h1>
	)
 }
export default app;

Distribution :
es6

const {name, age} = student;
console.log(name);
console.log(age);

react
const student({name, age)} => {
return (<h1>{name}</h1>
}
);
export default app;

Js:

Array Distribution :
const numbers= [10, 20, 30];
const[a,b,c] = numbers;
console.log(a);
console.log(b);
console.log(c);

react:
const App= () => {
const colors = ["Red", "Green", Black"];
const['first', 'second', 'third'] = colors;
return (
<div>
<p>{first}</p>
<p>{second}</p>
<p>{third}</p>
</div>
);
};
export default app;

node package module



React Oops and API integration :-
are built in functions, in react that allows functional components to use features such as state management, side effects, life cycle related behaviour and reusable logic without writing classes 


ex:
you are building an online shopping website like amazon, you need to track how many products a user added to the cart update the total price when the changes fetch the product details from an api for this react oops implement those features in functional components.


use state hook -> is a react hook used to maintain and manage state in functional component when state changes react render the components 
to display the updated value.


UseContext :-

is a built in feature , react hook that allows component share without props manually through every level of component tree is mainly used for global state management such as user authentication, dark mode / light mode.	



React API Integration :-
means connecting a react application to an external api (other s/w) to send or receive data.

Flow:

React Application
	|
	API
	|
    Database
	|
	API
	|
React Display Data








	