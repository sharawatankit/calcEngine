import requests
def repos_with_most_stars():
  gh_api_response = "https://api.github.com/search/repositories"
  parameters = {"q": "starts: > 5000"}
  response = requests.get(gh_api_response, params=parameters)
  json_response = response.json()
  print(json_response.keys())

repos_with_most_stars()