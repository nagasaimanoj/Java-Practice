package com.Character;

@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping("/api/characters")
class CharacterController {

    @org.springframework.beans.factory.annotation.Autowired
    private CharacterRepository characterRepository;

    @org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
    public Character create(@org.springframework.web.bind.annotation.RequestBody Character character) {
        character.setId(null);
        return characterRepository.saveAndFlush(character);
    }

    @org.springframework.web.bind.annotation.RequestMapping(value = "{id}", method = org.springframework.web.bind.annotation.RequestMethod.PUT)
    public Character update(@org.springframework.web.bind.annotation.PathVariable Integer id, @org.springframework.web.bind.annotation.RequestBody Character updatedcharacter) {
        Character character = characterRepository.getOne(id);
        character.setName(updatedcharacter.getName());
        return characterRepository.saveAndFlush(character);
    }

    @org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
    java.util.List<Character> read() {
        return characterRepository.findAll();
    }

    @org.springframework.web.bind.annotation.RequestMapping(value = "{id}", method = org.springframework.web.bind.annotation.RequestMethod.DELETE)
    @org.springframework.web.bind.annotation.ResponseStatus(org.springframework.http.HttpStatus.NO_CONTENT)
    void delete(@org.springframework.web.bind.annotation.PathVariable("id") Integer id) {
        characterRepository.delete(id);
    }
}