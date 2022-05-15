const startButton = document.getElementById('start-btn')
const questionContainerElement = document.getElementById('question-container')
const questionElement = document.getElementById('question')
const nextButton = document.getElementById('next-btn')
const answerButtonsElement = document.getElementById('answer-buttons')
let shuffledQuestions, currentQuestionIndex

startButton.addEventListener('click', startGame)
nextButton.addEventListener('click', () => {
	currentQuestionIndex++
	setNextQuestion()
})


function startGame() {
	console.log('Started!')
	startButton.classList.add('hide')
	shuffledQuestions = question.sort(() => Math.random() - .5)
	currentQuestionIndex = 0
	questionContainerElement.classList.remove('hide')
	setNextQuestion()
}

function setNextQuestion() {
	resetState()
	showQuestion(shuffledQuestions[currentQuestionIndex])
}

function showQuestion(question) {
	questionElement.innerText = question.question
	question.answer.forEach(answer => {
		const button = document.createElement('button')
		button.innerText = answer.text
		button.classList.add('btn')
		if (answer.correct) {
			button.dataset.correct = answer.correct
		}
		button.addEventListener('click', selectAnswer)
		answerButtonsElement.appendChild(button)
	})
}

function resetState() {
	clearStatusClass(document.body)
	nextButton.classList.add('hide')
	while (answerButtonsElement.firstChild) {
		answerButtonsElement.removeChild(answerButtonsElement.firstChild)
	}
}

function selectAnswer(e) {
	const selectedButton = e.target
	const correct = selectedButton.dataset.correct
	setStatusClass(document.body, correct)
	Array.from(answerButtonsElement.children).forEach(button => {
		setStatusClass(button, button.dataset.correct)
	})
	if ( currentQuestionIndex < 4) {
		nextButton.classList.remove('hide')
	} else {
		startButton.innerText = 'Restart'
		startButton.classList.remove('hide')
	}
}

function setStatusClass(element, correct) {
	clearStatusClass(element)
	if (correct) {
		element.classList.add('correct')
	} else {
		element.classList.add('wrong')
	}
}

function clearStatusClass(element) {
	element.classList.remove('correct')
	element.classList.remove('wrong')
}

const question = [
	{
		question: "Which land animal is endangered in Victoria?",
		answer: [{
				text: 'A. Tortoise',
				correct: false
			},
			{
				text: 'B. Panda',
				correct: false
			},
			{
				text: 'C. Koala',
				correct: true
			},
			{
				text: 'D. Beluga whale',
				correct: false
			}
		]
	},
	{
		question: "Is koala a () animal?",
		answer: [{
				text: 'A. microorganism-eating animal',
				correct: false
			},
			{
				text: 'B. herbivore (plant-eating animal)',
				correct: true
			},
			{
				text: 'C. carnivore (meat-eating animal)',
				correct: false
			},
			{
				text: 'D. Omnivores (meat/plant-eating animal)',
				correct: false
			}
		]
	},
	{
		question: "Is goat an introduced species to Australia?",
		answer: [{
				text: 'A. Yes',
				correct: true
			},
			{
				text: 'B. No',
				correct: false
			}
		]
	}, 
	{
		question: "Which of the following reason is the main reason for the decline in the number of koalas?",
		answer: [{
				text: 'A. Climate change and severe weather',
				correct: false
			},
			{
				text: 'B. Invasive species and diseases',
				correct: false
			},
			{
				text: 'C. Adverse fire regimes',
				correct: true
			},
			{
				text: 'D. Fragmentation and degradation',
				correct: false
			}
		]
	}, 
	{
		question: "Are kangaroos carnivores (meat-eating animal)?",
		answer: [{
				text: 'A. yes',
				correct: false
			},
			{
				text: 'B. No',
				correct: true
			}
		]
	}, 
	{
		question: "Are Platypus carnivores (meat-eating animal)?",
		answer: [{
				text: 'A. yes',
				correct: true
			},
			{
				text: 'B. No',
				correct: false
			}
		]
	}, 
	{
		question: "Where do platypus live?",
		answer: [{
				text: 'A. Edges of cleared land and plantations',
				correct: false
			},
			{
				text: 'B. Grassland and woodland',
				correct: false
			},
			{
				text: 'C. Tropical and subtropical forests',
				correct: false
			},
			{
				text: 'D. Freshwater rivers and streams',
				correct: true
			}
		]
	}, 
	{
		question: "Where do Kangaroo live?",
		answer: [{
				text: 'A. Dry woodlands',
				correct: false
			},
			{
				text: 'B. Tropical and subtropical forests',
				correct: false
			},
			{
				text: 'C. Grassy woodlands and forests',
				correct: true
			},
			{
				text: 'D. Range of areas',
				correct: false
			}
		]
	}, 
	{
		question: "Which of the following animals is native to Australia?",
		answer: [{
				text: 'A. Ringtail Possum',
				correct: true
			},
			{
				text: 'B. Goat',
				correct: false
			},
			{
				text: 'C. Fallow Deer',
				correct: false
			},
			{
				text: 'D. Fox',
				correct: false
			}
		]
	}, 
	{
		question: "Are Squirrel Glider Omnivores?",
		answer: [{
				text: 'A. No',
				correct: false
			},
			{
				text: 'B. Yes',
				correct: true
			}
		]
	}, 
	{
		question: "Which of the following animals is introduced to Australia?",
		answer: [{
				text: 'A. Koala',
				correct: false
			},
			{
				text: 'B. Sugar Glider',
				correct: false
			},
			{
				text: 'C. Swamp Wallaby',
				correct: false
			},
			{
				text: 'D. Black Rat',
				correct: true
			}
		]
	}, 
	{
		question: "Do bush rats like urban places?",
		answer: [{
				text: 'A. Yes',
				correct: false
			},
			{
				text: 'B. No',
				correct: true
			}
		]
	}, 
	{
		question: "Little Forest Bat’s diet?",
		answer: [{
				text: 'A. Nectar',
				correct: false
			},
			{
				text: 'B. Plants',
				correct: false
			},
			{
				text: 'C. Insects',
				correct: true
			},
			{
				text: 'D. Moss',
				correct: false
			}
		]
	},
	{
		question: "Black Flying-fox’s diet?",
		answer: [{
				text: 'A. Nectar',
				correct: true
			},
			{
				text: 'B. Plants',
				correct: false
			},
			{
				text: 'C. Insects',
				correct: false
			},
			{
				text: 'D. Moss',
				correct: false
			}
		]
	},
	{
		question: "House mouse’s habitat are associated with human disturbance?",
		answer: [{
				text: 'A. Yes',
				correct: true
			},
			{
				text: 'B. No',
				correct: false
			}
		]
	},
	{
		question: "Are Brushtail Possums endangered animals?",
		answer: [{
				text: 'A. Yes',
				correct: true
			},
			{
				text: 'B. No',
				correct: false
			}
		]
	},
	{
		question: "What’s the color of common wombat?",
		answer: [{
				text: 'A. Brown',
				correct: true
			},
			{
				text: 'B. Grey',
				correct: false
			},
			{
				text: 'C. Black',
				correct: false
			},
			{
				text: 'D. White',
				correct: false
			}
		]
	},
	{
		question: "Does Agile Antechinus die after breeding?",
		answer: [{
				text: 'A. Yes',
				correct: true
			},
			{
				text: 'B. No',
				correct: false
			}
		]
	}
]
